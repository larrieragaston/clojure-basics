;; Definir la función sig-mul-10 que reciba un número entero y devuelva el primer múltiplo de 10 que lo supere.
;; (defn sig-mul-10 [x] (* (inc (quot x 10)) 10))
(defn sig-mul-10 [x] ((fn may [n] (if (> (* 10 n) x) (* 10 n) (may (inc n)))) 1))
;; Test case
(prn (sig-mul-10 31))