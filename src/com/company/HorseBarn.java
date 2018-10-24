package com.company;

public class HorseBarn {
    private Horse[] spaces;

    public HorseBarn(Horse[] spaces) {
        this.spaces = spaces;
    }
    public int findHorseSpace(String name) {
        for (int i = 0; i < this.spaces.length; i ++) {
            if (this.spaces[i] != null && this.spaces[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void consolidate() {
        for (int i = 0; i < this.spaces.length - 1; i ++) {
            if (this.spaces[i] == null) {
                for (int j = 1 + i; j < this.spaces.length; j ++) {
                    if (this.spaces[j] != null) {
                        this.spaces[i] = this.spaces[j];
                        this.spaces[j] = null;
                        j = this.spaces.length;
                    }
                }
            }
        }
    }

}
