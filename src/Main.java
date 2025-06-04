//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        if (age >= 18 && hasID) {
            System.out.println("접속가능");
        }else {
            System.out.println("불가능");
        }

        boolean isWeekend = false;
        boolean isHoliday = true;

        if (isWeekend || isHoliday) {
            System.out.println("쉴 수 있습니다.");
        }else {
            System.out.println("쉴 수 없습니다.");
        }

        boolean isRaining = true;
        if (!isRaining) {
            System.out.println("비가 내리지 않습니다.");
        } else {
            System.out.println("비가 내립니다.");
        }
    }
}