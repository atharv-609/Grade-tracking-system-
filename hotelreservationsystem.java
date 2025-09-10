class Room:
    def __init__(self, number, category, price, is_available=True):
        self.number = number
        self.category = category
        self.price = price
        self.is_available = is_available

class Reservation:
    def __init__(self, guest_name, room, check_in, check_out):
        self.guest_name = guest_name
        self.room = room
        self.check_in = check_in
        self.check_out = check_out
        self.payment_status = 'Pending'

class Hotel:
    def __init__(self):
        self.rooms = []
        self.reservations = []

    def search_rooms(self, category, date):
        # Return available rooms by category
        pass

    def book_room(self, guest_name, category, check_in, check_out):
        # Book an available room; simulate payment
        pass

    def cancel_reservation(self, reservation_id):
        # Cancel a reservation and update room status
        pass

    def view_booking_details(self, guest_name):
        # Return reservations for user
        pass

# For file I/O:
import json
def save_data(filename, data):
    with open(filename, 'w') as f:
        json.dump(data, f)

def load_data(filename):
    with open(filename, 'r') as f:
        return json.load(f)
  
