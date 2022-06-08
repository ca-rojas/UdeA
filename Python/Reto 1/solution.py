"""
NO ELIMINAR LAS SIGUIENTES IMPORTACIONES, 
El equipo de desarrollo de este calificador modificó las funciones 'print' e 'input'.
Esta modificación se hizo con la finalidad de que el sistema pueda calificar tu solución.
Por eso LEER MUY BIEN LO QUE SE SOLICITA Y LAS RESTRICCIONES QUE SE LE IMPUSIERON A ESTAS DOS FUNCIONES.
"""
#from student_utilities import input, print

def solucion():
    #ACÁ INICIA LA FUNCIÓN SOLUCIÓN (En este espacio debes entregar tu solución)
    
    nota=nota_acumulada=porcentaje=porcentaje_total=porcentaje_temp=0
        
    print("¡Bienvenido! En esta aplicación los estudiantes podrán gestionar las notas de su materia.")
    
    nombre=input("Por favor ingrese su nombre: ")
    materia=input("Ingrese el nombre de la materia: ")
    nota=input("Ingrese la nota obtenida: ")
    nota=float(nota)
    porcentaje=input("Ingrese el porcentaje de la nota: ")
    porcentaje=float(porcentaje)

    nota_parcial=nota * porcentaje
    porcentaje_total=porcentaje_total + porcentaje
    
    while(porcentaje_total < 100):
        anadir=input("¿Falta añadir notas? S/N ")
        anadir=(anadir.upper())
        if anadir == "S":
            nota=input("Ingrese la nota obtenida: ")
            nota=float(nota)
            porcentaje=input("Ingrese el porcentaje de la nota: ")
            porcentaje=float(porcentaje)
            porcentaje_temp = porcentaje_total + porcentaje
            if porcentaje_temp > 100:
                while porcentaje_temp > 100:
                    print("El porcentaje evaluado de una materia no puede ser mayor a 100")
                    nota=input("Ingrese la nota obtenida: ")
                    nota=float(nota)
                    porcentaje=input("Ingrese el porcentaje de la nota: ")
                    porcentaje=float(porcentaje)
                    porcentaje_temp = porcentaje_total + porcentaje
            porcentaje_total=porcentaje_total + porcentaje
            nota_parcial=nota_parcial+(nota*porcentaje)
        elif anadir == "N":
            break
    
    nota_parcial = nota_parcial / 100
    nota_acumulada = round(nota_parcial,2)
        
    if(nota_acumulada >= 3):
        aprobacion = "aprobado"
    else:
        aprobacion = "reprobado"

    print(f'El estudiante {nombre.title()} cursó la materia {materia.capitalize()} y obtuvo {nota_acumulada} resultando en {aprobacion}') 
    
solucion()

    #ACÁ TERMINA LA FUNCIÓN SOLUCIÓN
