class Patient {
    int patientId;
    String patientName;
    int age;
    String disease;

    Patient(int patientId, String patientName, int age, String disease) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.disease = disease;
    }

    void display() {
        System.out.println("Patient ID : " + patientId);
        System.out.println("Patient Name : " + patientName);
        System.out.println("Age : " + age);
        System.out.println("Disease : " + disease);
        System.out.println("----------------------------");
    }
}
