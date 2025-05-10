package d0510.dataIO.lecture;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pharmacy> pharmacies = PharmacyCsvReader.readCsv("약국목록.csv");

        for(Pharmacy p : pharmacies){
            System.out.println(p);
        }
        
//        long count = pharmacies.stream()
//                .filter(p-> "경기".equals(p.getCityName()))
//                .count();
//        System.out.println("count = " + count);

        //경기에 위치한 약국 걸러내기
        List<Pharmacy> filteredPharmacy1 = pharmacies.stream()
                .filter(p-> "경기".equals(p.getCityName()))
                .toList();
        filteredPharmacy1.forEach(System.out::println);
        //전화번호 필드가 빈 약국만 걸러내기
        List<Pharmacy> filteredPharmacy2 = pharmacies.stream()
                .filter(p->p.getPhone().isBlank())
                .toList();
        filteredPharmacy2.forEach(System.out::println);
        long count = filteredPharmacy2.size();
        System.out.println("count = " + count);

        //개설날짜가 2025년도인 약국만 조회하기
        List<Pharmacy>filteredPharmacy3 = pharmacies.stream()
                .filter(p->p.getOpenDate().startsWith("2025"))
                .toList();
        filteredPharmacy3.forEach(System.out::println);
        long count3 = filteredPharmacy3.size();
        System.out.println("count3 = " + count3);

        List<Pharmacy> filteredPharmacy4 = pharmacies.stream()
                .filter(p->p.getOpenDate().startsWith("2025"))
                .filter(p->p.getPhone().isBlank())
                .filter(p-> "경기".equals(p.getCityName()))
                .toList();
        filteredPharmacy4.forEach(System.out::println);
        long count4 = filteredPharmacy4.size();
        System.out.println("count4 = " + count4);
    }
}
