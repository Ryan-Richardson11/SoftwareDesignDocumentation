"""
Project1.py
Contains a Rectangle class that displays calculations based on the users input.
The class is fully documented using pydocs.
"""

class Rectangle:
    """
    Rectangle class
    This class stores methods for a rectangle object, including the calculation of its perimeter and area.
    """

    def __init__(self, width, length):
        """
        Constructor method for the Rectangle class
        Parameters:
        width: width of the rectangle
        length: length of the rectangle
        """
        self.width = width
        self.length = length
    
    def perimeter(self):
        """
        Perimeter method for Rectangle class
        Returns: The perimeter of the rectangle, calculated as 2 * (width + length)
        """
        return 2 * (self.width + self.length)

    def area(self):
        """
        Area method for Rectangle class
        Returns: The area of the rectangle
        """
        return (self.width * self.length)

    def display(self):
        """
        Display method for Rectangle class
        Prints out the user input for width and length, as well as the calculations for perimeter and area.
        """
        perimeter = self.perimeter()
        area = self.area()
        print("The width of the rectangle is {}".format(self.width))
        print("The length of the rectangle is {}".format(self.length))
        print("The perimeter of the rectangle is {}".format(perimeter))
        print("The area of the rectangle is {}".format(area))

