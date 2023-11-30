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

class Multipc{
    double cost;
    CPU cpu;
    HD hd;
    double total;
    Multipc(int a, int b){
        cpu = new CPU(2.4);
        hd = new HD(160);
        total = a * cpu.cost + b * hd.cost;
    }
    public double gC(){
        return total * 1.2;
    }
    public double gP(){
        return total * 1.8;
    }
}




public class J02 {
    public static void main(String[] args) {
        PC pc = new PC();
        System.out.println("PC cost:" + pc.gc() + ", price:" + pc.gp());
        Multipc m1 = new Multipc(2, 4);
        Multipc m2 = new Multipc(4, 8);
        System.out.println("MultiPC: 2CPU, 4HD, COST:" + m1.gC() + ", price:" + m1.gP());
        System.out.println("MultiPC: 4CPU, 8HD, COST:" + m2.gC() + ", price:" + m2.gP());
    }
}