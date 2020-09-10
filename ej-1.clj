;; 1. Definir la función tercer-angulo que reciba los valores de dos de los ángulos interiores de un triángulo y
;;  devuelva el valor del restante.
(defn tercer-angulo [angulo-1 angulo-2] (- 180 angulo-1 angulo-2))

;; Test cases
(print (tercer-angulo 45 45))