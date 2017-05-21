package com.iori.mapper;

import com.iori.entity.Chain;

import java.util.List;

/**
 * Created by iori on 17/5/21.
 */
public interface ChainMapper {
    String getMasterId(String loginName);
    List<Chain> get1(String masterId);
    List<Chain> get2(String masterId);
    List<Chain> get3(String masterId);
    List<Chain> get4(String masterId);
    List<Chain> get5(String masterId);
}
