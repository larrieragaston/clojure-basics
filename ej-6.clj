;; Definir la función aprox-pi que reciba la cantidad de términos a considerar entre los paréntesis 
;; de la expresión 4 · (1 - 1/3 + 1/5 - 1/7 + ... + 1/n) y devuelva la correspondiente aproximación de π.

;; (defn terminos [x] (if (= x 1) 
;;                      1 
;;                      (+ (if (odd? x) 
;;                           (/ 1 (- (* x 2) 1)) 
;;                           (* -1 (/ 1 (- (* x 2) 1)))) (terminos (- x 1)))))

;; OPTIMIZADO
(defn terminos [x] (if (= x 1)
                     1
                     (+ (#(if (odd? x) % (- %)) (/ (dec (* x 2)))) (terminos (dec x)))))

(defn aprox-pi [x] (double (* 4 (if (zero? x) 1 (terminos x)))))

;; Test cases
(prn (aprox-pi 0))
(prn (aprox-pi 1))
(prn (aprox-pi 5))
(prn (aprox-pi 15))
(prn (aprox-pi 30))