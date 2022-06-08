#NO ELIMINAR LAS SIGUIENTES IMPORTACIONES, sirven para el funcionamiento de las librería csv y json respectivamente
import csv, json, math
"""NOTAS: 
    - PARA ESTE RETO PUEDES PROBAR TU PROGRAMA, DANDO CLICK EN LA NAVE ESPACIAL
    - LA CONSOLA TE DIRÁ SI TU SOLUCIÓN ES CORRECTA O NO
    - NO olvidar evaluar tu solución
"""


"""Inicio espacio para programar funciones propias"""
#En este espacio podrás programar las funciones que deseas usar en la función solución (ES OPCIONAL)
def reto5():
# se define que el delimitador será la tabulación
    csv.register_dialect("tabs", delimiter="\t")

    # Crear una lista vacia y la lista inicial con las columnas del nuevo archivo csv
    listas = []
    salida = [['Fecha analizada','Comportamiento de la accion','Ajuste Cuadratico de Close']]

    # Abrir el archivo csv en modo lectura para crear la lista sobre la que se trabajará
    with open('TESLA.csv','r') as tesla:
        lector = csv.reader(tesla)
        for fila in lector:
            listas.append(fila)

    # Inicializar variables temporales
    lowest_open = float(listas[1][1])
    highest_close = float(listas[1][4])
    mean_volume_tmp = 0
    greatest_difference = 0

    for x in range (1,len(listas)):
        # convertir los valores de la lista de str a float
        apertura = float(listas[x][1])
        cierre = float(listas[x][4])
        ajuste_cierre = float(listas[x][5])
        high_value = float(listas[x][2])
        low_value = float(listas[x][3])

        # Valores CSV
        fecha = (listas[x][0])
        if (cierre-apertura) > 0:
            comportamiento = 'SUBE'
        elif (cierre-apertura) < 0:
            comportamiento = 'BAJA'
        else:
            comportamiento ='ESTABLE'
        ajuste = (math.sqrt((cierre-ajuste_cierre)**2))

        # Valores JSON
        if apertura < lowest_open:
            lowest_open = float(listas[x][1])
            date_lowest_open = listas[x][0]
        if cierre > highest_close:
            highest_close = float(listas[x][4])
            date_highest_close = listas[x][0]
        mean_volume_tmp = mean_volume_tmp+int(listas[x][6])
        absolute_value_tmp = abs(low_value-high_value)
        if absolute_value_tmp > greatest_difference:
            greatest_difference = absolute_value_tmp
            date_greatest_difference = listas[x][0]

        #Generacion lista para CSV
        test = [fecha,comportamiento,ajuste]
        salida.append(test)

    #creacion diccionario para generar el archivo JSON
    mean_volume=mean_volume_tmp/(len(listas)-1)
    diccionario_json = {'date_lowest_open': date_lowest_open, 'lowest_open': lowest_open, 'date_highest_close': date_highest_close, 'highest_close': highest_close, 'mean_volume': mean_volume, 'date_greatest_difference': date_greatest_difference, 'greatest_difference': greatest_difference}

    with open('analisis_archivo.csv','w', newline='') as csvfile:
        escritor = csv.writer(csvfile, dialect="tabs")
        escritor.writerows(salida)

    with open('detalles.json','w') as archivo:
        json.dump(diccionario_json,archivo)

"""Fin espacio para programar funciones propias"""

def solucion():
    reto5()

solucion()