class LCD {
    int size;
    int cost;

    public LCD(int size) {
        this.size = size;
        if (size == 10) {
            this.cost = 2000;
        } else if (size == 15) {
            this.cost = 2500;
        } else if (size == 17) {
            this.cost = 3000;
        }
    }
}

class CPU {
    double speed;
    int cost;

    public CPU(double speed) {
        this.speed = speed;
        if (speed == 1.66) {
            this.cost = 6000;
        } else if (speed == 2.2) {
            this.cost = 8000;
        } else if (speed == 2.4) {
            this.cost = 11000;
        }
    }
}

class HD {
    int hdd;
    int cost;

    public HD(int  hdd) {
        this.hdd = hdd;
        if (hdd == 120) {
            this.cost = 2400;
        } else if (hdd == 160) {
            this.cost = 2800;
        }
    }
}

class PC {
    CPU cpu;
    HD hd;

    public PC() {
        this.cpu = new CPU(2.4);
        this.hd = new HD(160);
    }

    public int gc() {
        return cpu.cost + hd.cost + 500;
    }

    public int gp() {
        return (int) 1.8 * (cpu.cost + hd.cost);
    }
}

class Note15 {
    LCD lcd;
    CPU cpu;
    HD hd;

    public Note15() {
        this.lcd = new LCD(15);
        this.cpu = new CPU(2.2);
        this.hd = new HD(160);
    }

    public int gc() {
        return (int) (1.4 * (lcd.cost + cpu.cost + hd.cost));
    }

    public int gp() {
        return 2 * (lcd.cost + cpu.cost + hd.cost);
    }
}

class AIIPC{
    public static boolean isExpensive(PC pc, Note15 note15){
        return pc.gp() > note15.gp();
    }
}

public class J03 {
    public static void main(String[] args) {
        PC pc = new PC();
        Note15 note15 = new Note15();
        if (AIIPC.isExpensive(pc, note15)) {
            System.out.println("PC is more expensive than Note15");
        } else {
            System.out.println("Note15 is more expensive than PC");
        }
    }
}
