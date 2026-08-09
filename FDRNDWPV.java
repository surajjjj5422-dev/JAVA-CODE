// Generate a 4 digit random number and display it in words along with positional value.
class FDRNDWPV
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
            case 1:System.out.print("one thounsand ");
                break;
            case 2:System.out.print("two thounsand ");
                break;
            case 3:System.out.print("three thounsand ");
                break;
            case 4:System.out.print("four thounsand ");
                break;
            case 5:System.out.print("five thounsand ");
                break;
            case 6:System.out.print("six thounsand ");
                break;
            case 7:System.out.print("saven thounsand ");
                break;
            case 8:System.out.print("eight thounsand ");
                break;
            case 9:System.out.print("nine thounsand ");
                break;

        }
        switch (d2) {
            case 0:System.err.print("");break;
            case 1:System.out.print("one hundred ");
                break;
            case 2:System.out.print("two hundred ");
                break;
            case 3:System.out.print("three hundred ");
                break;
            case 4:System.out.print("four hundred ");
                break;
            case 5:System.out.print("five hundred ");
                break;
            case 6:System.out.print("six hundred ");
                break;
            case 7:System.out.print("saven hundred ");
                break;
            case 8:System.out.print("eight hundred ");
                break;
            case 9:System.out.print("nine hundred ");
                break;

        }

        switch (d3) {
            case 0:System.err.print(" ");break;
            case 1:System.out.print("one ");
                break;
            case 2:System.out.print("tweenty ");
                break;
            case 3:System.out.print("thirty ");
                break;
            case 4:System.out.print("fourty ");
                break;
            case 5:System.out.print("fivety ");
                break;
            case 6:System.out.print("sixty ");
                break;
            case 7:System.out.print("saventy ");
                break;
            case 8:System.out.print("eightty ");
                break;
            case 9:System.out.print("ninety ");
                break;

        }

        switch (d4) {
            case 0:System.err.print("");break;
            case 1:System.out.print("one ");
                break;
            case 2:System.out.print("two ");
                break;
            case 3:System.out.print("three ");
                break;
            case 4:System.out.print("four ");
                break;
            case 5:System.out.print("five ");
                break;
            case 6:System.out.print("six ");
                break;
            case 7:System.out.print("saven ");
                break;
            case 8:System.out.print("eight ");
                break;
            case 9:System.out.print("nine ");
                break;

        }
    
    }
}
