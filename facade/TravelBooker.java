public class TravelBooker {
    private HotelBooker hotelBoogker;
    private FlightBooker flightBooker;
    
    public TravelBooker(HotelBooker hotelB, FlightBooker flightB) {
        this.hotelBoogker = hotelB;
        this.flightBooker = flightB;
    }
    
    public void getHotelsAndFlights() {
        ArrayList<Hotel> hotels = hotelBoogker.getHotelNamesFor(Date in, Date out);
        ArrayList<Flight> flights = flightBooker.getFlightNamesFor(Date dep, Date arr);
        // Process.....
        Syste.out.println("Flights and Accomaodations for dates....");
    }
}