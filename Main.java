import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Airplane airplane = new Airplane(1, "737 MAX", "Boeing", "SN123456", 2); // kapasite 2 olarak örnek

        List<Reservation> reservations = new ArrayList<>();

        Flight flight = createFlightFromUserInput(scanner, airplane);

        List<Flight> flights = new ArrayList<>();
        flights.add(flight);

        while (true) {
            System.out.println("\nMevcut Uçuşlar:");
            for (Flight f : flights) {
                System.out.println("Flight ID: " + f.getId());
                System.out.println(f);
                System.out.println("--------------");
            }

            System.out.print("Rezervasyon yapmak ister misiniz? (evet/hayır): ");
            String cevap = scanner.nextLine().trim().toLowerCase();
            if (!cevap.equals("evet")) {
                break;
            }

            if (reservations.size() >= airplane.getSeatCapacity()) {
                System.out.println("Uçakta yer kalmadı!");
                continue;
            }

            System.out.print("Ad: ");
            String ad = scanner.nextLine();

            System.out.print("Soyad: ");
            String soyad = scanner.nextLine();

            System.out.print("Yaş: ");
            int yas = Integer.parseInt(scanner.nextLine());

            int rezervasyonId = reservations.size() + 1;
            int koltukNo = rezervasyonId;

            Reservation rezervasyon = new Reservation(rezervasyonId, ad, soyad, yas, flight, koltukNo);
            reservations.add(rezervasyon);

            System.out.println("Rezervasyon başarılı:");
            System.out.println(rezervasyon);
            System.out.println("--------------");
        }

        System.out.println("Toplam rezervasyonlar: " + reservations.size());
    }

    private static Flight createFlightFromUserInput(Scanner scanner, Airplane airplane) {
        System.out.println("Kalkış bilgilerini giriniz:");
        System.out.print("Ülke: ");
        String departureCountry = scanner.nextLine();
        System.out.print("Şehir: ");
        String departureCity = scanner.nextLine();
        System.out.print("Havalimanı: ");
        String departureAirport = scanner.nextLine();

        Location departureLocation = new Location(1, departureCountry, departureCity, departureAirport, true);

        System.out.println("Varış bilgilerini giriniz:");
        System.out.print("Ülke: ");
        String arrivalCountry = scanner.nextLine();
        System.out.print("Şehir: ");
        String arrivalCity = scanner.nextLine();
        System.out.print("Havalimanı: ");
        String arrivalAirport = scanner.nextLine();

        Location arrivalLocation = new Location(2, arrivalCountry, arrivalCity, arrivalAirport, true);

        System.out.println("Uçuş tarih ve saatini giriniz (örn: 2025 06 01 10 30):");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        scanner.nextLine(); // boşluğu tüketmek için

        LocalDateTime departureTime = LocalDateTime.of(year, month, day, hour, minute);
        LocalDateTime arrivalTime = departureTime.plusHours(2);

        return new Flight(1, airplane, departureLocation, arrivalLocation, departureTime, arrivalTime);
    }
}
