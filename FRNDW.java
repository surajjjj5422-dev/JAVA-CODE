// Generate a 4 digit random number and display in it words
class FRNDW
{
    public static void main(String[] args) {
        int n=(int)(Math.random()*10000);

        System.out.println("Number= "+n);
        int r,d1,d2,d3,d4;
        d4=n%10;
        n=n/10;
        d3=n%10;
        n=n/10;
        d2=n%10;
        n=n/10;
        d1=n%10;
        switch (d1) {
            case 1:System.out.println("one ");
                break;
            case 2:System.out.println("two ");
                break;
            case 3:System.out.println("three ");
                break;
            case 4:System.out.println("four ");
                break;
            case 5:System.out.println("five ");
                break;
            case 6:System.out.println("six ");
                break;
            case 7:System.out.println("saven ");
                break;
            case 8:System.out.println("eight ");
                break;
            case 9:System.out.println("nine ");
                break;

        }
        switch (d2) {
            case 0:System.err.println("Zero");break;
            case 1:System.out.println("one ");
                break;
            case 2:System.out.println("two ");
                break;
            case 3:System.out.println("three ");
                break;
            case 4:System.out.println("four ");
                break;
            case 5:System.out.println("five ");
                break;
            case 6:System.out.println("six ");
                break;
            case 7:System.out.println("saven ");
                break;
            case 8:System.out.println("eight ");
                break;
            case 9:System.out.println("nine ");
                break;

        }

        switch (d3) {
            case 0:System.err.println("Zero");break;
            case 1:System.out.println("one ");
                break;
            case 2:System.out.println("two ");
                break;
            case 3:System.out.println("three ");
                break;
            case 4:System.out.println("four ");
                break;
            case 5:System.out.println("five ");
                break;
            case 6:System.out.println("six ");
                break;
            case 7:System.out.println("saven ");
                break;
            case 8:System.out.println("eight ");
                break;
            case 9:System.out.println("nine ");
                break;

        }

        switch (d4) {
            case 0:System.err.println("Zero");break;
            case 1:System.out.println("one ");
                break;
            case 2:System.out.println("two ");
                break;
            case 3:System.out.println("three ");
                break;
            case 4:System.out.println("four ");
                break;
            case 5:System.out.println("five ");
                break;
            case 6:System.out.println("six ");
                break;
            case 7:System.out.println("saven ");
                break;
            case 8:System.out.println("eight ");
                break;
            case 9:System.out.println("nine ");
                break;

        }
    }
}