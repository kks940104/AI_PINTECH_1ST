package exam01;

public class Ex01
{
    public static void main(String[] args)
    {
        // 1. 변수 두 개를 선언해서 20과 3.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해 보시오
        int a = 20;
        double b = 3.0;
        int c = (int)(a * b);
        System.out.println(c);

        // 2. 학생 40명이 리조트에 수학여행을 갔습니다. 리조트로 수학여행을 갔습니다.
        // 리조트는 방이 10개 있고 방번호는 0~9번까지 있습니다,
        // 40명의 학생이 각각 번호표를 받아 한 방에 4명씩 배정하여 다음과 같이 출력하시오(예 : 학생1, 방번호 1번)

        int studentOfCount = 40;
        int roomNum = 0;
        int studentRealNumber = 0;
        int roomLimit = 4;

        for (int i = 0; i < studentOfCount; i++)
        {
            if (studentRealNumber % roomLimit == 0 && studentRealNumber != 0)
            {
                System.out.println("-----------------------------------");
                roomNum++;
            }
            System.out.printf("학생 %d, 방번호 %d %n",(studentRealNumber + 1), roomNum);
            //System.out.println("학생" + (studentRealNumber + 1) + ", " + "방번호 " + roomNum + "번");
            studentRealNumber++;
        }

//        //강사님 코드
//        for (int i = 1; i <= 40; i++)
//        {
//            int roonNo = i % 10;
//            System.out.printf("학생%d, 방 번호 %d%n", i, roonNo);
//        }

        // 5층 건물이 있습니다.
        // 1층 약국,
        // 2층 정형외과,
        // 3층 피부과,
        // 4층 치과,
        // 5층 헬스클럽입니다.
        // 건물의 층을 누르면 그 층이 어떤 곳인지 알려주는 엘리베이터가 있을 때
        // 이를 swich ~ case문으로 구현하시오(5층인 경우 ‘5층 헬스클럽입니다.’)

        int elevatorFloor = 3;

        switch (elevatorFloor)
        {
            case 1: System.out.println("1층 약국."); break;
            case 2: System.out.println("2층 정형외과."); break;
            case 3: System.out.println("3층 피부과."); break;
            case 4: System.out.println("4층 치과."); break;
            case 5: System.out.println("5층 헬스클럽."); break;
            default : System.out.println("없음 ㅅㄱ"); break;
        }

        // 4. 구구단을 홀수 단만 출력하도록 프로그램을 만드시오. 구현 소스

        for (int i = 1; i < 10; i++)
        {
            for (int j = 1; j < 10; j++)
            {
                if (i % 2 == 1)
                {
                    System.out.printf("구구단을 외자! %d단. %d X %d = %d%n", i, i, j, i * j);
                    //System.out.println("구구단을 외자! " + i + "단. " + i + " x " + j + " = " + (i * j));
                }
            }
            if (i % 2 == 1) System.out.println("-----------------------------------");
        }

        // 강사님 코드

//        for (int i = 2; i <= 9; i++)
//        {
//            if (i % 2 == 1)
//            {
//                System.out.printf("--- %d단 ---%n", i);
//                for (int j = 1; j <= 9; j++) System.out.printf("%d X %d = %d%n", i, j, i * j);
//            }
//        }

        for (int i = 2; i <= 9; i++)
        {
            if (i % 2 == 0)
            {
                continue;
            }
            System.out.printf("--- %d단 ---%n", i);
            for (int j = 1; j <= 9; j++) System.out.printf("%d X %d = %d%n", i, j, i * j);
        }
        // 5. 구구단을 단보다 곱하는 수가 크거나 같은 경우만 출력하는 프로그램을 만들어 보세요.구현 소스

        for (int i = 1; i < 10; i++)
        {
            for (int j = 1; j < 10; j++)
            {
                if (i > j)
                {
                    continue;
                }
                System.out.printf("구구단을 외자! %d단. %d X %d = %d%n", i, i, j, i * j);
                //System.out.println("구구단을 외자! " + i + "단. " + i + " x " + j + " = " + (i * j));
            }
            System.out.println("-----------------------------------");
        }

        // 강사님 코드

        for (int i = 2; i <= 9; i++)
        {
            System.out.printf("--- %d단 ---%n", i);
            for (int j = 1; j <= 9; j++)
            {
                if (j < i) continue;

                System.out.printf("%d X %d = %d%n", i, j, i * j);
            }
        }

        // 참고 자료 구구단
//        for (int i = 2; i <= 9; i++)
//        {
//            System.out.printf("--- %d단 ---%n",i);
//            for (int j = 1; j <= 9; j++)
//            {
//                System.out.printf("%d X %d = %d%n", i, j, i * j);
//            }
//        }



    }
}