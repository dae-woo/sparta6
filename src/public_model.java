public class public_model {
    public static void main(String[] args) {}


        int max_Customer;
        int current_Customer;
        int remaining_Customer;

        int price;
        int number;
        int fuel_Amount;
        String status_taxi = "일반 상태";
        int basicFare;
        int distance;


        int speed;
        int change_Speed;
        boolean status;
        public public_model(){}





    public public_model(int number) {
            this.number = number;
            System.out.println(number +"번 넘버링 설정완료");
        }

        public void drive() {
            System.out.println("--"+this.number+"번 버스 운행중--");
            status = true;
            fuel_Amount = 100;
        }
        public void drive_taxi() {
            System.out.println("--"+this.number+"번 택시 운행중--");
            this.status_taxi = "일반";
            fuel_Amount = 100;
        }


        public int setChange_Fuel(int get_fuel) {
            this.fuel_Amount = get_fuel;
            if (this.fuel_Amount == 0) {
                status = false;
                System.out.println("연료가 없습니다.");
            }
            else if (this.fuel_Amount < 10) {
                status = false;
                System.out.println("주유가 필요하다.");
            }
            else {
            System.out.println("주유량을 확인해 주세요.");
            }
        return get_fuel;
       }


        public void status (boolean status){
            if (!status) {
                this.status = false;
                System.out.println("운행이 종료 되었습니다");
            } else {
                this.status = true;
            }
        }


        public int getPassenger(int get_Customer) {
            if (status = true)
                    if(remaining_Customer() >= get_Customer) {
                        this.current_Customer += get_Customer;
                        System.out.println(this.number+"번 버스"+this.current_Customer()+"명 승객 탑승중입니다");
                     }
                    else  {
                        System.out.println(this.max_Customer+"명 최대 승객입니다");
                    }
                return  get_Customer;
        }

        public int getPassengertaxi(int get_Customer) {
            if (status_taxi == "일반")
                if(get_Customer<=max_Customer) {
                    this.current_Customer = get_Customer;
                    System.out.println("승객 탑승중입니다");
                    status_taxi = "운행중";
                }
                else  {
                    System.out.println("탑승 불가");
                }
            return  get_Customer;
        }

        public void basicFare() {
            System.out.println("기본요금은 " + basicFare + " 원 이며 기본거리는 1KM, 추가요금은 1KM당 1000원 입니다");
            }
        public void distance(int distance) {
            this.distance = basicFare + ((distance - 1) * 1000);
            status_taxi = "일반";
            System.out.println("목적지에 도착했습니다. 목적지까지 거리는 " + distance + "M이며 총 지불하실 금액은 " + this.distance + " 입니다.");
            System.out.println("남은 주유량은 " + fuel_Amount + " 입니다.");
            }


        public void setChange_Speed() {
            if (this.fuel_Amount >= 10) {
            }
            System.out.println("주유량을 확인해 주세요.");

        }

        public int current_Customer() {
            return current_Customer;
        }
        public int remaining_Customer() {
            remaining_Customer = (max_Customer-current_Customer);
            return remaining_Customer;
        }


        public int getPrice() {
            price = 1000 * current_Customer;
            System.out.println("요금 "+price+" 원");
            return price;
        }





}

//손님증가 메서드확인

//1. **아래의 정보를 가지는 ‘Bus’ 클래스 모델링**
//    - 포함해야 할 정보
//        1. 최대 승객수
//        2. 현재 승객수
//        3. 요금
//        4. 버스 번호
//        5. 주유량
//        6. 현재 속도
//        7. 상태
//            1.  운행, 차고지 행
//    - 기능
//        1. 운행
//        2. 버스 상태 변경
//        3. 승객 탑승
//        4. 속도 변경
//
//    **요구사항**
//
//    - 버스 번호
//        - 버스 객체 생성시 번호는 고유값으로 생성되어야 합니다. +
//    - 버스 상태 변경
//        - 버스 객체 생성시 최초 상태는 **‘운행’** 상태가 되며
//        - 주유량이 떨어지거나, 운행을 종료할 때 **‘차고지행’** 상태로 변경 합니다.
//        - 10미만일 경우 ‘주유가 필요하다’는 메시지를 출력해 주세요
//    - 승객 탑승
//        - 승객 탑승은 **‘최대 승객수’** 이하까지 가능하며 **‘운행 중’**인 상태의 버스만 가능합니다.
//        - 탑승시 현재 승객수가 증가되어야 합니다.
//    - 속도 변경
//        - 주유 상태를 체크하고 주유량이 10 이상이어야 운행할 수 있습니다.
//            - 경고메시지
//                - 주유량을 확인해 주세요.
//                - print문으로 출력
//        - 변경할 속도를 입력 받아 현재 속도에 추가 하거나 뺄 수 있어야 합니다.
