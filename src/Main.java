public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1");
        //Задание 1
        System.out.println("Задача 1");
        int age = 25;
        if ( age >= 18 ) {
            System.out.println("Поздравляем с совершеннолетем!");
            }
        if ( age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }

        //Задание 2
        System.out.println("Задача 2");
        if (age >= 7 && age < 18 ){
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24 ){
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if ( age >= 24 ) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        //Задание 3.1 (сделано самостоятельно без видеоразбора, в условиях задачи не указано, что в консоли должно выводиться количество мест:)) )
        System.out.println("Задача 3.1");
        int passenger = 75;
        if ( passenger <= 60){
            System.out.println("В вагоне есть сидячие места");
        }
        if ( passenger >= 60 && passenger < 102){
            System.out.println("В вагоне есть стоячие места");
        }
        if ( passenger > 102){
            System.out.println("Вагон забит");
        }

        // Задание 3.2 (за основу взят видеоразбор)
        System.out.println("Задача 3.2");
        int passengers = 102;
        int seat = 60;
        int standingPlace = passengers - seat;

        int travelerSit = 71;
        int travelerStand = 25;
        if (travelerSit <= seat){
            System.out.println("В вагоне осталось " + (seat - travelerSit) + " сидячих мест");
        }
        if (travelerSit > seat){
            System.out.println("В вагоне не осталось сидячих мест");
        }
        if (travelerStand <= standingPlace) {
            System.out.println("В вагоне осталось " + (standingPlace - travelerStand) + " стоячих мест");
        }
        if (travelerStand > standingPlace) {
            System.out.println("В вагоне не осталось стоячих мест");
        }

}
}
