package hw.hw5.p2;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OrderAnalysis {
    public static void main(String[] args) {
        // 제품 목록 생성
        Product laptop = new Product("노트북", "전자제품", 1200000);
        Product phone = new Product("스마트폰", "전자제품", 800000);
        Product book = new Product("자바 책", "도서", 30000);
        Product headphone = new Product("헤드폰", "전자제품", 120000);
        Product tablet = new Product("태블릿", "전자제품", 500000);
        Product charger = new Product("충전기", "액세서리", 25000);

        // 주문 목록 생성
        List<Order> orders = Arrays.asList(
                new Order(1, "김철수", Arrays.asList(laptop, headphone), LocalDate.of(2023, 3, 15)),
                new Order(2, "이영희", Arrays.asList(phone, charger), LocalDate.of(2023, 4, 20)),
                new Order(3, "박민수", Arrays.asList(book, tablet), LocalDate.of(2023, 5, 10)),
                new Order(4, "최지원", Arrays.asList(laptop, phone, charger), LocalDate.of(2023, 5, 22)),
                new Order(5, "김철수", Arrays.asList(tablet, book), LocalDate.of(2023, 6, 5))
        );

        // 1. 총액이 100만원 이상인 주문의 ID 목록
        List<Integer> highValueOrderIds = orders.stream()
                .filter(order -> order.getTotalAmount() >= 1_000_000)
                .map(Order::getOrderId)
                .collect(Collectors.toList());
        System.out.println("1. 100만원 이상 주문 ID: " + highValueOrderIds);

        // 2. 고객별 총 주문 금액
        Map<String, Double> customerTotalAmount = orders.stream()
                .collect(Collectors.groupingBy(Order::getCustomerName,
                        Collectors.summingDouble(Order::getTotalAmount)));
        System.out.println("2. 고객별 총 주문 금액: " + customerTotalAmount);

        // 3. 가장 많이 구매된 제품 카테고리
        String mostFrequentCategory = orders.stream()
                .flatMap(order -> order.getProducts().stream())
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("없음");
        System.out.println("3. 가장 많이 구매된 카테고리: " + mostFrequentCategory);

        // 4. 2023년 5월 이후의 주문에서 구매된 제품 이름 (중복 없이)
        Set<String> productNamesAfterMay = orders.stream()
                .filter(order -> order.getOrderDate().isAfter(LocalDate.of(2023, 4, 30)))
                .flatMap(order -> order.getProducts().stream())
                .map(Product::getName)
                .collect(Collectors.toSet());
        System.out.println("4. 5월 이후 구매 제품명: " + productNamesAfterMay);

        // 5. 제품 카테고리별 평균 가격
        Map<String, Double> avgPriceByCategory = orders.stream()
                .flatMap(order -> order.getProducts().stream())
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)));
        System.out.println("5. 카테고리별 평균 가격: " + avgPriceByCategory);

        // 6. 주문 날짜별 총 주문 금액
        Map<LocalDate, Double> totalAmountByDate = orders.stream()
                .collect(Collectors.groupingBy(Order::getOrderDate,
                        Collectors.summingDouble(Order::getTotalAmount)));
        System.out.println("6. 날짜별 총 주문 금액: " + totalAmountByDate);
    }
}
