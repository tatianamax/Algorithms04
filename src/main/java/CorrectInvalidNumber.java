public class CorrectInvalidNumber {
//    С заданным целым числом M выполните следующие условные действия:
//            ● Если M кратно 3 и 5, вернуть "Хорошее число".
//            ● Если M кратно только 3, а не 5, вернуть «Неверный номер».
//            ● Если M кратно только 5, а не 3, вернуть "Плохое число".
//            ● Если M не удовлетворяет ни одному из вышеперечисленных условий, вернуть «-1».

    public String CorrectInvalidNumberMethod(int m){
        if(m% 3 == 0 & m % 5 == 0){
            return "Хорошее число";
        }if(m% 3 == 0 & m% 5 !=0){
            return "Неверный номер";
        }if(m% 5 ==0){
            return "Плохое число";
        }else {
            return "-1";
        }
    }
}