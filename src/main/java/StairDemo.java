public class StairDemo {
    public static void main(String[] args) {
        System.out.println(stairs(6));
    }


    private static String stairs(int level){
        String result = "";
        if(level <= 0) return "Must be larger than 0";
        if(level > 100) return "Maximum 100";
        String[][] matrix = new String[level][level];
        for(int i = 0; i < level; i++){
            String[] row = matrix[i];
            matrix[i] = createLine(row, i); //fill # by level
        }

        boolean firstLine = true;
        for(String[] row: matrix){
            if(!firstLine)
                result+="\n";
            for(int i=0;i < row.length;i++){
                if(row[i] == null || row[i].trim().isEmpty()){
                    result+=" ";
                }else
                    result+=row[i];
            }
            firstLine=false;

        }

        return result;
    }

    /**
     * fill #
     * @param row
     * @param level
     * @return
     */
    private static String[] createLine(String[] row, int level){
        String[] rs = new String[row.length];
        //fill # from level to the end
        int startPosition = (row.length - 1) - level;
        for(int i =  startPosition ; i < row.length ;i++){
            rs[i] = "#";
        }
        return rs;
    }

}
