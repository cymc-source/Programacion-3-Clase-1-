from H_Automovil import DAD_Vehiculo

class H_Automovil (DAD_Vehiculo):
    def __init__(self, F_fabricacion, vinchasis, vinmotor, marca, modelo, precio
    ):
 super().__init__(F_fabricacion, vinchasis, vinmotor)
 self.marca = marca
 self.modelo = modelo
 self.precio = precio

 def getmarca(self):
    return self.marca

    def getmodelo(self):
    return self.modelo

    def getprecio(self):
    return self.precio

    def mostrar_datos(self):
        print("datos del automovil: ")
        print("Fecha Fabricación:", self.getF_fabricacion())
        print("VIN Chasis: ", self.getvinchasis())
        print("VIN Motor: ", self.getvinmotor())
        print("Marca: ", self.getmarca())
        print("Modelo: ", self.getmodelo())
        print("Precio: ", self.getprecio())