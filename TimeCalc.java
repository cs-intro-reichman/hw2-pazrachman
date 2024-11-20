public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        int minutestoadd = Integer.parseInt(args[1]);

        int totalminutes = (hours * 60) + minutes + minutestoadd;
        int totalhours = (totalminutes /60);
        int newhours = ((totalminutes / 60) % 24);
        int newminutes = totalminutes - (totalhours * 60);

        if (newhours > 10 && newminutes > 10) {
        System.out.println( newhours + ":" + newminutes);
        } else if (newhours <10 && newminutes<10 ){
        System.out.println("0" + newhours + ":0" + newminutes );
        } else if (newhours >10 && newminutes <10){
        System.out.println(newhours + ":0" + newminutes);
        }else if (newhours < 10 && newminutes > 10) {
        System.out.println("0" + newhours + ":" + newminutes);    
        }
    
    
    }
        


    }

