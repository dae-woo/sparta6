

public class taxi_001 extends public_model {

    public static void main(String[] args) {
        public_model taxi_001 = new public_model(001);
        System.out.println("==========차량출고==========");

        taxi_001.max_Customer = 4;
        taxi_001.basicFare = 3000;

        taxi_001.drive_taxi();
        taxi_001.setChange_Fuel(100);
        taxi_001.getPassengertaxi(1);
        System.out.println(taxi_001.status_taxi);
        System.out.println("==========/최대 4명/손님 1명/연료 100/운행상태==========");
        taxi_001.distance(12);


        System.out.println(taxi_001.status_taxi);
        taxi_001.getPassengertaxi(5);
        System.out.println("==========/최대 4명/손님 5명/연료 100/탑승불가==========");
        taxi_001.getPassengertaxi(4);
        taxi_001.distance(5);

        System.out.println("==========/최대 4명/손님 4명/연료 100/운행상태==========");

        taxi_001.setChange_Fuel(0);
        System.out.println("==========/최대 4명/손님 0명/연료 5/차고지행==========");

        System.out.println(taxi_001.status);

    }
}


