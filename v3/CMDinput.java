package com.company.v3;

public class CMDinput implements Input {
    private String []args;

    public CMDinput(String []args){
        this.args = args;
    }
    @Override
    public String read() {
        return args[0];
    }
}
