package ds25.hotel.reservation.management.system.configuration;

import ds25.hotel.reservation.management.system.entity.hotel.HotelReview;
import ds25.hotel.reservation.management.system.repository.hotel.HotelRepository;
import ds25.hotel.reservation.management.system.repository.hotel.HotelReservationRepository;
import ds25.hotel.reservation.management.system.repository.hotel.HotelReviewRepository;
import ds25.hotel.reservation.management.system.repository.hotel.HotelRoomRepository;
import ds25.hotel.reservation.management.system.provider.UserProvider;
import ds25.hotel.reservation.management.system.repository.user.UserRepository;
import ds25.hotel.reservation.management.system.service.hotel.HotelReservationService;
import ds25.hotel.reservation.management.system.service.hotel.HotelReviewService;
import ds25.hotel.reservation.management.system.service.hotel.HotelRoomService;
import ds25.hotel.reservation.management.system.service.hotel.HotelService;
import ds25.hotel.reservation.management.system.service.user.UserService;
import lombok.Data;

@Data
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    // Repository
    public UserRepository userRepository;
    public HotelRepository hotelRepository;
    public HotelRoomRepository hotelRoomRepository;
    public HotelReservationRepository hotelReservationRepository;
    public HotelReviewRepository hotelReviewRepository;

    // Service
    public UserService userService;
    public HotelService hotelService;
    public HotelRoomService hotelRoomService;
    public HotelReservationService hotelReservationService;
    public HotelReviewService hotelReviewService;

    // Provider
    public UserProvider userProvider;

    public void init() {
        userRepository = new UserRepository();
        hotelRepository = new HotelRepository();
        hotelRoomRepository = new HotelRoomRepository();
        hotelReservationRepository = new HotelReservationRepository();
        hotelReviewRepository = new HotelReviewRepository();

        userService = new UserService();
        hotelService = new HotelService();
        hotelRoomService = new HotelRoomService();
        hotelReservationService = new HotelReservationService();
        hotelReviewService = new HotelReviewService();

        userProvider = new UserProvider();
    }
}
