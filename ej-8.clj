;; Definir la función nth-fibo que reciba un número entero no negativo y 
;; devuelva el correspondiente término de la sucesión de Fibonacci.
(defn nth-fibo [x] (if (or (zero? 0) (= x 1)) x (+ (nth-fibo (dec x)) (nth-fibo (- x 2)))))

;; Test cases
(prn (nth-fibo 0))
(prn (nth-fibo 1))
(prn (nth-fibo 2))
(prn (nth-fibo 3))
(prn (nth-fibo 4))
(prn (nth-fibo 5))
(prn (nth-fibo 6))
(prn (nth-fibo 7))
(prn (nth-fibo 8))
(prn (nth-fibo 9))
(prn (nth-fibo 10))