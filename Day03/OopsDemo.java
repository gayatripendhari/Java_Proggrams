public class OopsDemo{
   // public static void main(String[] args) {
        private int serialNo;
        private String Name;
        private int age;

        //getters and setters
        public int getSerialNo(){
            return serialNo;
        }
        public void setSerialNo(int serialNo){
            this.serialNo = serialNo;
        }
        public String getName(){
            return Name;
        }
        public void setName(String name){
            Name = name;
        }
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age = age;
        }

        //object class method
        @Override
        public String toString(){
            return "OopsDemo [serialNo= "+serialNo+", Name= "+Name+", age= "+age+"]";
        }

    }
//}