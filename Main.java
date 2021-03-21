public class Main{
  public static void main(String[] args){

    //DATATYPES
    int myVar;
    myVar = 20;
    System.out.println(myVar);
    int anotherVar = 100;
    System.out.println(anotherVar);
  //  System.out.System.out.println(anotherVar);
  myVar = anotherVar;
  System.out.println(myVar);
  anotherVar = 200;
  System.out.println(anotherVar);
  int firstValue = 300;
  int otherValue = firstValue;
  System.out.println(otherValue);

//float
  float b = 10.0f;
  float c = 33.0f;
  float d = c%b;
  System.out.println(d);

  //prefix
  System.out.println(++myVar);
  System.out.println(myVar);

  //postfix
  System.out.println(myVar++);
  System.out.println(myVar);

  //compound assignment
  //example1
  int myVal = 50;
  myVal-= 5;
  System.out.println(myVal );

  //example2
  int result = 500;
  result/= myVal + myVar;
  System.out.println(result);

  //predence
  int valA = 21;
  int valB = 6;
  int valC = 3;
  int valD = 1;
  int result1=  valA - valB/valC;
  int result2= (valA-valB)/valC;
  System.out.println(result1 +" " +"and"+" "+ result2  );

   //TYPE CONVERSION
    //implicit type conversion
    int iva1 = 20;
    long iival=iva1;
    System.out.println(iival);

    //explicit type conversion
    int ival = (int)++iival;
    System.out.println(iival);

    //FURTHER example
    float floatVal = 1.0f;
    double doubleVal = 4.0d;
    byte byteVal = 7;
    short shortVal = 7;
    long longVal = 5;
//    short result3 = byteVal;
    short result3 = (short)longVal;
    System.out.println("Success");
    short result4 = (short)(byteVal-longVal);
    System.out.println(result4);
    float result5 = longVal-floatVal;
    System.out.println(result5);

    //CONDITIONS ASSIGNMENTS

    int z = 7;
    int y = 2;
    int result6 = y > z ? y : z;
    System.out.println(result6);
    int diff = z - y;
    //if-else statement
    if (y>z) {
      System.out.println("y is bigger than z");
    }System.out.println("z is bigger than y");
    System.out.println(diff);

    //block statements

















 }
}
