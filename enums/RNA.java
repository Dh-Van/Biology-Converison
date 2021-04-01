package enums;

public enum RNA {
    T, A, G, C;

        @Override
        public String toString(){
            switch(this){
                case T:
                    return "T";   
                case A:
                    return "A";   
                case C:
                    return "C";   
                case G:
                    return "G";     
                default:
                    return null;
            }
        }

        public String convert(){
            switch(this){
                case A:
                    return "U ";   
                case C:
                    return "G ";   
                case G:
                    return "C ";   
                case T:
                    return "A "; 
                default:
                    return null; 
                
            }
        }
}
