from Padre import *

class Hija(Padre):
    def __init__(self, nombre,edad):
        super().__init__(nombre)
        self.edad = edad