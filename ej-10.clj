;; Definir la función pot? que reciba dos números naturales y devuelva true si el primero es potencia del 
;; segundo; si no, false.
(defn pot? [potencia base] (if (or (= potencia 1) (= potencia base)) true 
                               (if (< potencia 1) false (pot? (/ potencia base) base))))

;; Test cases
;; (prn (pot? 0 0)) -> indeterminacion
(prn (pot? 4 2))
(prn (pot? 81 3))
(prn (pot? 81 5))
(prn (pot? 81 2))
(prn (pot? 125 5))
(prn (pot? 81 4))