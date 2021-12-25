package SetHashSet.SetHashSetOrnek

class Ogrenci(var ogrenciNo: Int, var ogrenciAd: String, var ogrenciSinif: String) {

    override fun hashCode(): Int {
        return this.ogrenciNo
    }

    override fun equals(other: Any?): Boolean {
       if(this.ogrenciNo==(other as Ogrenci).ogrenciNo){
           return true
       }else{
           return false
       }
    }

}