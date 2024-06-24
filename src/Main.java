public class Main {
    public static void main(String[] args) {
//1
var dog =8.0;
var cat = 3.6;
var paper = 763789;
        System.out.println( dog );
        System.out.println( cat );
        System.out.println( paper);
//2
        dog += 4;
        cat += 4;
        paper = paper+4;


        System.out.println( "Теперь переменная равна " + dog );
        System.out.println( "Теперь переменная равна " + cat );
        System.out.println("Теперь переменная равна " + paper);

//3

        var dog1 =8.0;
        var cat1= 3.6;
        var paper1 = 763789;

      dog1 = dog1-3.5;
      cat1=cat1-1.6;
      paper1=paper1-7639;
        System.out.println( dog1 );
        System.out.println( cat1 );
        System.out.println( paper1);

//4

var friend  = 19;

        System.out.println( "Первое значение "+ friend);
        friend  = friend +2;
        System.out.println( "Второе значение "+ friend);
        friend  = friend /7;
        System.out.println( "Третье значение "+ friend);
        //5

var frog =3.5;

        System.out.println( "Первое значение "+frog);
        frog=frog*10;
        System.out.println( "Второе значение "+frog);
        frog=frog/3.5;
        System.out.println( "Третье значение "+frog);
        frog=frog+4;
        System.out.println( "Четвертое значение "+frog);

//6
        var boxerWeight1 =78.2;
        var boxerWeight2 =82.7;
        var weightSum = boxerWeight1+boxerWeight2 ;
        var weightDiff = boxerWeight2-boxerWeight1;
        System.out.println( " Общая масса бойцов состаляет " + weightSum);
        System.out.println("Разница между массами составляет "+ weightDiff);

        //7

        var lostDif= boxerWeight2%boxerWeight1;
System.out.println( "Остаток от деления состовляет"+ lostDif);


//8

        var workingHours=640;
        var people = workingHours/8;
        System.out.println ( "Всего работников в компании " + people + " человек");
        var peoplePlus=  people+94;
        var workingHoursNew= workingHours/peoplePlus;
        System.out.println ( "Если в компании работает " + peoplePlus+" человек, то всего " + workingHoursNew +" часов работы может быть поделено между сотрудниками»");









    }
}