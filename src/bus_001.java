

public class bus_001 extends public_model {



    public static void main(String[] args) {
        public_model bus_001 = new public_model(001);
        public_model bus_002 = new public_model(002);
        System.out.println("==========차량출고==========");


        bus_001.max_Customer = 30;

        bus_001.drive();
        bus_001.setChange_Fuel(100);
        bus_001.getPassenger(1);
        bus_001.getPrice();
        System.out.println("==========/최대 30명/손님 1명/연료 100/계산==========");

        bus_001.getPassenger(2);
        bus_001.getPrice();
        System.out.println("==========/최대 30명/손님 2명/연료 100/계산==========");

        bus_001.getPassenger(45);
        System.out.println("==========/최대 30명/손님 45명/연료 100/==========");

        bus_001.getPassenger(27);
        bus_001.getPrice();
        System.out.println("==========/최대 30명/손님 30명/연료 100/계산==========");

        bus_001.setChange_Fuel(5);
        System.out.println("==========/최대 30명/손님 30명/연료 5/차고지행==========");

        System.out.println(bus_001.status);

    }
}


