;; Definir la función cant-dig que reciba un número entero y devuelva la cantidad de dígitos que este tiene.
(defn cant-dig [x] (if (zero? x) 0 (inc (cant-dig (quot x 10)))))

;; Test cases
(prn (cant-dig 0))
(prn (cant-dig 10))
(prn (cant-dig -115))
(prn (cant-dig 87098690))
(prn (cant-dig -87098690))