package com.lianjia.test_glz.design_pattern.command;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午12:12 2018/11/28
 * @Modified By:
 */
public class Invoker {

    private Command[] onCommands;
    private Command[] offCommands;
    private final int slotNum = 9;

    public Invoker() {
        onCommands = new Command[slotNum];
        offCommands = new Command[slotNum];
    }

    public void setOnCommands(Command command,int slot) {
        this.onCommands[slot] = command;
    }

    public void setOffCommands(Command command,int  slot) {
        this.offCommands[slot] = command;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].excute();
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].excute();
    }

}

