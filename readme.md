# DE-GWO Algorithm

## Introduction

The DE-GWO algorithm is an algorithm based on the Grey Wolf algorithm for detecting epistasis interactions in GWAS data.

## Usage

### On Simulated Data

`java -jar de-gwo.jar -maxGen 2000`

### On Real Data

`java -jar de-gwo.jar -maxGen 2000 -type 1 -pathIn example`

### Parameters Of DE-GWO

|parameter name|description|
|:------:|:------|
|help|display help description|
|pathIn|path of the GWAS data, default 'data.txt'.|
|pathO|path of the file recording the results, default 'result.txt'.|
|type|type of the GWAS data, 0 for simulated, 1 for PLINK tped format, default 0.|
|seed|seed of random, default 0.|
|o|the maximum order of SNP combinations, default -1.|
|maxL|the maximum length of contingency table, default -1.|
|cG|threshold, default cG=0.05.|
|maxGen|the number of SNP combinations generated, default -1.|
|numWolves|number of the wolves in the algorithm.|
|leaderIncreaseWeight|leaderIncreaseWeight, default 0.2.|
|maxRate|maxRate, default 1.|

