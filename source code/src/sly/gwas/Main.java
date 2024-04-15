package sly.gwas;
import sly.gwas.algorithm.GWO;

import java.io.IOException;

/**
 * 目前来说，相对于SHEIB：
 * 1.结合灰狼算法；
 * 2.加入对p-value的多重验证修正；
 */
public class Main {
    public static void main(String[] args) {
        //String pathIn="E:\\data\\gwas\\sim_data_20220613\\DNME302_1600_100\\0_46_97.txt";
        //String pathIn="d:\\workspace\\java\\de-gwo\\example";
        //GWO gwo=new GWO(new String[]{"-pathIn",pathIn,"-maxGen","200000","-numWolves","20","-seed","0","-type","1","-ll","0"});
        GWO gwo=new GWO(args);
        switch (gwo.getLl()){
            case 0:
                Logger.setLevel(Logger.INFO);
                break;
            case 1:
                Logger.setLevel(Logger.DEBUG);
                break;
            default:
                Logger.setLevel(Logger.INFO);
                break;
        }
        if(gwo.isReady()) {
            if (gwo.loadData()) {
                gwo.run();
                try {
                    gwo.generateResults();
                } catch (IOException e) {
                    e.printStackTrace();
                    Logger.error("生成结果文件失败");
                }
            }
        }
    }
}
