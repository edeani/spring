/* global field */
var map;
var sector;
var marker;


function replaceAll(toreplace,oldstr,newstr){
    while (toreplace.indexOf(oldstr)!==-1){
        toreplace=toreplace.replace(oldstr,newstr);
    }
    return toreplace;
}
function getCookie(nombre){
	    var cookies=document.cookie;
	    if(!cookies) return false;
	    var comienzo=cookies.indexOf(nombre);
	    if(comienzo===-1) return false;
	    comienzo=comienzo+nombre.length+1;
	    cantidad=cookies.indexOf("; ", comienzo)-comienzo;
	    if(cantidad<=0) cantidad=cookies.length;
	    return cookies.substr(comienzo, cantidad);
}

function mapaTurnOn() {
    var latlngCol ='4.6310628,-74.083934' /* getCookie("center")*/;
    latlngCol = replaceAll(latlngCol,'"','');
    var coordCenterCool = latlngCol.split(",");
    var coor_col=new google.maps.LatLng(parseFloat(coordCenterCool[0]),parseFloat(coordCenterCool[1]));
    map = new google.maps.Map(document.getElementById('map'), {
        zoom: 20,
        center: coor_col,
        mapTypeId: google.maps.MapTypeId.ROADMAP
    });
    var coordArea = replaceAll('[{"lat":4.6872302,"lng":-74.0954264},{"lat":4.6489007,"lng":-74.1266292},{"lat":4.6033661,"lng":-74.07996},{"lat":4.6278161,"lng":-74.0638729},{"lat":4.6872302,"lng":-74.0954264}]"','"[','[');
    coordArea = replaceAll(coordArea,']"',']');
    coordArea = coordArea.replace(/\\/g, '');
    var sectorCoord = $.parseJSON(coordArea);


    // Construct the polygon.
    sector = new google.maps.Polygon({
        paths: sectorCoord,
        strokeColor: '#FF0000',
        strokeOpacity: 0.8,
        strokeWeight: 2,
        fillColor: '#9AFE2E',
        fillOpacity: 0.35
    });
    sector.setMap(map);

    createMarker(coor_col,"Colombian Broaster");
}

function createMarker(coord,title){
    marker = new google.maps.Marker({
        position: coord,
        map: map,
        title: title
    });
}

