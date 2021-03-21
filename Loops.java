public class Loops{
public static void main(String[] args) {
  int kVal  = 8;
  int factorial  =  1;

  //while loop

/*  while(kVal > 1){
    factorial *= kVal;
    kVal --;
  }*/

  // do-while loop

/*  do{
  System.out.println(factorial);
  factorial *= kVal;
  kVal --;
  System.out.println(factorial);
}while(kVal > 1);*/

for (int iVal = 1 ;iVal<100 ; iVal *= 2) {
  System.out.println(iVal);
}


}
}
