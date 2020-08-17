;; 2. Definir la función segundos que reciba los cuatro valores (días, horas, minutos y segundos) del tiempo que dura un evento y devuelva el valor de ese tiempo expresado solamente en segundos.
;; Sin sobrecarga
(defn segundos [d h m s] (+ (* d 24 60 60) (* h 60 60) (* m 60) s))
;; Con sobrecarga
(defn segundos_sobrecarga 
  ([segs] segs)
  ([mins, segs] (segundos_sobrecarga (+ segs (* mins 60))))
  ([hours, mins, segs] (segundos_sobrecarga (+ (* hours 60) mins) segs))
  ([days, hours, mins, segs]  (segundos_sobrecarga (+ (* days 24) hours) mins segs))) 

;; Test case
(println (segundos 1 2 3 17))
(println (segundos_sobrecarga 17))
(println (segundos_sobrecarga 3 17))
(println (segundos_sobrecarga 2 3 17))
(println (segundos_sobrecarga 1 2 3 17))