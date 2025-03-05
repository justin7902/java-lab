public class CPU{
    double price;
    CPU(double price){
        this.price=price;
    }
    public void printInfo(){
        System.out.println("CPU price is:"+price);
    }
    class Processor {
        int core;
        String manufacture;
        Processor(int core, String manufacture){
            this.core=core;
            this.manufacture=manufacture;
        }
        public void printInfo(){
            System.out.println("Cores:" +core);
            System.out.println("Manufacturer of the Processor:" +manufacture);
        }
    }
    public static class RAM{
        int memory;
        String manufacture;
        RAM(int memory, String manufacture){
            this.memory=memory;
            this.manufacture=manufacture;
        }
        public void printInfo(){
            System.out.println("Ram Memory:" +memory +" GB");
            System.out.println("Manufacture of RAM:" +manufacture);
        }
        public static void main(String[] args){
            CPU cpu1=new CPU(300);
            CPU.Processor processor1=cpu1.new Processor(4,"Intel");
            CPU.RAM ram1=new CPU.RAM(8,"Corsa");
            cpu1.printInfo();
            processor1.printInfo();
            ram1.printInfo();
        }
    }
}