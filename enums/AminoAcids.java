package enums;

import javafx.scene.paint.Stop;

public enum AminoAcids {
    Met, Phe, Leu, Ser, Tyr, Cys, Trp, Pro, His, Gln, Arg, Ile, Thr, Asn, Lys, Val, Ala, Asp, Glu, Gly, Stop;

    @Override
    public String toString() {
        switch(this){
			case Ala:
			    return "Ala ";	
			case Arg:
                return "Arg ";
			case Asn:
				return "Asn ";
			case Asp:
				return "Asp ";
			case Cys:
                return "Cys ";
			case Gln:
				return "Gln ";
			case Glu:
				return "Glu ";
			case Gly:
				return "Gly ";
			case His:
				return "His ";
			case Ile:
				return "Ile ";
			case Leu:
				return "Leu ";
			case Lys:
				return "Lys ";
			case Met:
				return "Met ";
			case Phe:
				return "Phe ";
			case Pro:
				return "Pro ";
			case Ser:
				return "Ser ";
			case Stop:
				return "Stop ";
			case Thr:
				return "Thr ";
			case Trp:
				return "Trp ";
			case Tyr:
				return "Tyr ";
			case Val:
				return "Val ";
			default:
				return null;
        }
            
    }

    public String convert(String codon){

            switch (codon) {
                case "U U U":
                    return Phe.toString();
                case "U U C":
                    return Phe.toString();
                case "U U A":
                    return Leu.toString();
                case "U U G":
                    return Leu.toString();
                case "U C U":
                    return Ser.toString();
                case "U C C":
                    return Ser.toString();
                case "U C A":
                    return Ser.toString();
                case "U C G":
                    return Ser.toString();
                case "U A U":
                    return Tyr.toString();
                case "U A C":
                    return Tyr.toString();
                case "U A A":
                    return Stop.toString();
                case "U A G":
                    return Stop.toString();
                case "U G U":
                    return Cys.toString();
                case "U G C":
                    return Cys.toString();
                case "U G A":
                    return Stop.toString();
                case "U G G":
                    return Trp.toString();
                case "C U U":
                    return Leu.toString();
                case "C U C":
                    return Leu.toString();
                case "C U A":
                    return Leu.toString();
                case "C U G":
                    return Leu.toString();
                case "C C U":
                    return Pro.toString();
                case "C C C":
                    return Pro.toString();
                case "C C A":
                    return Pro.toString();
                case "C C G":
                    return Pro.toString();
                case "C A U":
                    return His.toString();
                case "C A C":
                    return His.toString();
                case "C A A":
                    return Gln.toString();
                case "C A G":
                    return Gln.toString();
                case "C G U":
                    return Arg.toString();
                case "C G C":
                    return Arg.toString();
                case "C G A":
                    return Arg.toString();
                case "C G G":
                    return Arg.toString();
                case "A U U":
                    return Ile.toString();
                case "A U C":
                    return Ile.toString();
                case "A U A":
                    return Met.toString();
                case "A U G":
                    return Met.toString();
                case "A C U":
                    return Thr.toString();
                case "A C C":
                    return Thr.toString();
                case "A C A":
                    return Thr.toString();
                case "A C G":
                    return Thr.toString();
                case "A A U":
                    return Asn.toString();
                case "A A C":
                    return Asn.toString();
                case "A A A":
                    return Lys.toString();
                case "A A G":
                    return Lys.toString();
                case "A G U":
                    return Ser.toString();
                case "A G C":
                    return Ser.toString();
                case "A G A":
                    return Arg.toString();
                case "A G G":
                    return Arg.toString();
                case "G U U":
                    return Val.toString();
                case "G U C":
                    return Val.toString();
                case "G U A":
                    return Val.toString();
                case "G U G":
                    return Val.toString();
                case "G C U":
                    return Ala.toString();
                case "G C C":
                    return Ala.toString();
                case "G C A":
                    return Ala.toString();
                case "G C G":
                    return Ala.toString();
                case "G A U":
                    return Asp.toString();
                case "G A C":
                    return Asp.toString();
                case "G A A":
                    return Glu.toString();
                case "G A G":
                    return Glu.toString();
                case "G G U":
                    return Gly.toString();
                case "G G C":
                    return Gly.toString();
                case "G G A":
                    return Gly.toString();
                case "G G G":
                    return Gly.toString();
               default:
                   return "null";
   }

    }
}
