package com.synthful.angst.app.durian;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.synthful.angst.common.AAngsta;

@Service
public class ScriptTemplates implements AAngsta {

    @Inject
    private String inquireFruitSQL;
    @Inject
    private String fruitySASMacro;

    @Value(value = "${fruit.name}")
    public void setNothing(String nothing) {
        getLogger().info("fruit.name:{}", nothing);
        getLogger().info("inquireFruitSQL:\n{}", inquireFruitSQL);
        getLogger().info("fruitySASMacro:\n{}", fruitySASMacro);
    }

}
