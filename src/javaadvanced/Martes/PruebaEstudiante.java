
package javaadvanced.Martes;

  class PruebaEstudiante {
      
      //Caso 5
      int dato = 5;
      
      public PruebaEstudiante(){
          Student s5 = new Student(this);
          s5.s();
      }
      
        public static void main(String[] args) {
            Student s1 = new Student(111, "Yoshi", "TecGuasave");
            Student s2 = new Student(112, "Pepe", "Uas");
            Student s3 = new Student(113, "Martin", "Milennium"); 
            
            Student s4 = new Student(114, "Lusiito", "PHSP", 10); 
            
//            s1.display();
//            s2.display();
//            s3.display();
            s1.mensaje();
            s2.mensaje();
            s3.mensaje();
            
            PruebaEstudiante p = new PruebaEstudiante();
            p.despliega();
            
            //caso 5
             PruebaEstudiante p2 = new PruebaEstudiante();
            //p2.despliega();
            
            //Caso 6
            new Student().getStudent().msg();

        }
        
        void muestra(PruebaEstudiante obj){
            System.out.println("Metodo es invocado");
        }
        
        void despliega(){
            muestra(this);
        }
  }
