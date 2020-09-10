;; Definir las funciones red, green, blue y alpha que reciban el valor numérico de un color de 32 bits y devuelvan, 
;; respectivamente, los valores de las componentes rojo, verde, azul y alfa (RGBA: red, green, blue, alpha) del mismo.
(defn red1 [r g b a] r)
(defn green1 [r g b a] g)
(defn blue1 [r g b a] b)
(defn alpha1 [r g b a] a)

(defn red2 [x] (subs x 0 2))
(defn green2 [x] (subs x 2 4))
(defn blue2 [x] (subs x 4 6))
(defn alpha2 [x] (subs x 6 8))

;; (defn red2 [x] (clojure.string/join "" (take 2 (seq x))))
;; (defn green2 [x] (clojure.string/join "" (take 2 (drop 2 (seq x)))))
;; (defn blue2 [x] (clojure.string/join "" (take 2 (drop 4 (seq x)))))
;; (defn alpha2 [x] (clojure.string/join "" (take 2 (drop 6 (seq x)))))

(defn red3 [x] (quot x 0xFFFFFF))
(defn green3 [x] (quot (rem x 0xFFFFFF) 0xFFFF))
(defn blue3 [x] (quot (rem x 0xFFFF) 0xFF))
(defn alpha3 [x] (rem x 0xFF))

;; Test case
(prn (red1 255 0 170 17))
(prn (green1 255 0 170 17))
(prn (blue1 255 0 170 17))
(prn (alpha1 255 0 170 17))

(prn (red2 "FF00AA11"))
(prn (green2 "FF00AA11"))
(prn (blue2 "FF00AA11"))
(prn (alpha2 "FF00AA11"))

;;estos ejemplos no andan correctamente
(prn (red3 0xFF00AA11))
(printf "%X" (red3 0xFF00AA11))
(prn (green3 0xFF00AA11))
(printf "%X" (green3 0xFF00AA11))
(prn (blue3 0xFF00AA11))
(printf "%X" (blue3 0xFF00AA11))
(prn (alpha3 0xFF00AA11))
(printf "%X" (alpha3 0xFF00AA11))