class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
   public class CourseChecker {
    public static boolean collegeCredit(String courseCode) {
        if (courseCode.length() >= 6) {
            char sixthChar = courseCode.charAt(5);
            return sixthChar == 'E' || sixthChar == 'M';
        }
        return false;
    }
}

public class CounselorFinder {
    public static String getCounselor(String officialClass) {
        if (officialClass == null || officialClass.length() == 0) return "Unknown";

        char firstChar = officialClass.charAt(0);
        char middleChar = officialClass.charAt(officialClass.length() / 2);

        return switch (firstChar) {
            case 'B' -> "Berrouet";
            case 'C' -> "Chu";
            case 'D' -> "Dinn";
            case 'E' -> "Eyzengart";
            case 'F' -> "Flores";
            case 'G' -> "Gibson";
            case 'L' -> "Shim Lee";
            case 'M' -> "Meltzer";
            case 'P' -> "Paccione";
            case 'S' -> "Fiore";
            case 'T' -> "Tsai";
            case 'Z' -> "Zayes";
            default -> switch (middleChar) {
                case 'B' -> "Berrouet";
                case 'C' -> "Chu";
                case 'D' -> "Dinn";
                case 'E' -> "Eyzengart";
                case 'F' -> "Flores";
                case 'G' -> "Gibson";
                case 'L' -> "Shim Lee";
                case 'M' -> "Meltzer";
                case 'P' -> "Paccione";
                case 'S' -> "Fiore";
                case 'T' -> "Tsai";
                case 'Z' -> "Zayes";
                default -> "Unknown";
            };
        };
    }
}

public class ImageTypeDetector {
    public static String imageType(String fileName) {
        if (fileName == null || !fileName.contains(".")) return "Unknown";

        String extension = fileName.substring(fileName.lastIndexOf('.') + 1).toUpperCase();

        return switch (extension) {
            case "JPEG", "JPG" -> "Joint Photographic Experts Group";
            case "PNG" -> "Portable Network Graphics";
            case "GIF" -> "Graphics Interchange Format";
            case "PDF" -> "Portable Document Format";
            default -> "Unknown";
        };
    }

    
  }

 
}