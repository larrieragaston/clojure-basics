;; Definir la función invertir que reciba un número entero no negativo y lo devuelva espejado.
(defn invertir [x] (Integer/parseInt (clojure.string/join "" (reverse (str x)))))

(defn cant_cifras [x] (if (== 0 (quot x 10)) 0 (+ 1 (cant_cifras (quot x 10)))))
(defn mult_10 [num] (apply * (repeat (cant_cifras num) 10)))
(defn invertir_recur [x] (if (<= x 10) x (+ (* (rem x 10) (mult_10 x)) (invertir_recur (quot x 10))))) ;; revisar

;; Test cases
(prn (invertir 312))
(prn (invertir 5216))
(prn (invertir 101083121))

(prn (invertir_recur 312))
(prn (invertir_recur 5216))
(prn (invertir_recur 101083121))
