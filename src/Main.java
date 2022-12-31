public class Main {
    public static void main(String[] args){
        Directory employee = new Directory("Employee");

        Directory permanent = new Directory("Permanent");

        Directory temporary = new Directory("Temporary");

        File ITEmployee = new File("ITEmployee");
        File nonITEmployee = new File("Non-IT Employee");

        File contigentWorker = new File("Contingent Worker");

        permanent.add(ITEmployee);
        permanent.add(nonITEmployee);

        temporary.add(contigentWorker);

        employee.add(permanent);
        employee.add(temporary);

        employee.ls();
    }

}
