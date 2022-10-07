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
        System.out.println("Домашнее задание 2");
        //Задание 1
        System.out.println("Задача 1");
        int age2 = 8;
        if ( age2 >= 18 ) {
            System.out.println("Поздравляем с совершеннолетем!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }

        //Задание 2
        System.out.println("Задача 2");
        if (age2 >= 7 && age2 < 18 ){
            System.out.println("Ребенок ходит в школу");
        } else if (age2 >= 18 && age2 < 24 ){
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (age2 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        //Задание 3.1 (сделано самостоятельно без видеоразбора, в условиях задачи не указано, что в консоли должно выводиться количество мест:)) )
        System.out.println("Задача 3.1");
        int passenger2 = 150;
        if ( passenger2 <= 60){
            System.out.println("В вагоне есть сидячие места");
        } else if ( passenger2 >= 60 && passenger2 < 102){
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("Вагон забит");
        }
        // Задание 3.2 (за основу взят видеоразбор)
        System.out.println("Задача 3.2");
        int passengers2 = 102;
        int seat2 = 60;
        int standingPlace2 = passengers - seat;

        int travelerSit2 = 71;
        int travelerStand2 = 25;
        if (travelerSit2 <= seat){
            System.out.println("В вагоне осталось " + (seat2 - travelerSit2) + " сидячих мест");
        } else {
            System.out.println("В вагоне не осталось сидячих мест");
        }
        if (travelerStand2 <= standingPlace2) {
            System.out.println("В вагоне осталось " + (standingPlace2 - travelerStand2) + " стоячих мест");
        } else {
            System.out.println("В вагоне не осталось стоячих мест");
        }
        System.out.println("Домашнее задание 3");
        //Задача 1
        System.out.println("Задача 1");
        int human = 44;
        if (human >=2 && human <= 6) {
            System.out.println("Если возраст человека равен " + human + " годам, то ему нужно ходить в детский сад");
        } else if (human >= 7 && human <= 18) {
            System.out.println("Если возраст человека равен " + human + " годам, то ему нужно ходить в школу");
        } else if (human >= 18 && human <= 24) {
            System.out.println("Если возраст человека равен " + human + " годам, то ему нужно ходить в университет");
        } else if (human > 24 ){
            System.out.println("Если возраст человека равен " + human + " годам, то ему нужно ходить на работу");
        }
        //Задание 2
        System.out.println("Задача 2");
        int parkVisitor = 15;
        if (parkVisitor <5){
            System.out.println("Ребенку в возрасте " + parkVisitor + " лет нельзя кататься на аттракционах");
        } else if (parkVisitor < 14) {
            System.out.println("Ребенку в возрасте " + parkVisitor + " лет можно кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }else  {
            System.out.println("Если ребенок старше " + parkVisitor + " лет, то он может кататься без сопровождения взрослого");

        }
        //Задача 3
        System.out.println("Задача 3");
        int one = 245;
        int two = 508;
        int three = 558;

        if (one > two) {
            if (one >= three) {
                System.out.println("бОльшим числом является " + one);
            } else  {
                System.out.println("бОльшим число является " + three);
            }
        }else if (two > one) {
                if (two >= three){
                    System.out.println("бОльшим числом является " + two);
                } else if (three > two) {
                    System.out.println("бОльшим число является " + three);
                }
        }

    }
}
