function datetime()
{
    let dt = new Date();
    //current date
    let date = ("0"+dt.getDate()).slice(-2);

    //current month
    let month = ("0"+ (dt.getMonth()+1)).slice(-2);

    //current year
    let year = dt.getFullYear();

    //current hours
    let hours = dt.getHours();

    //current minutes
    let minutes = dt.getMinutes();

    //current seconds
    let seconds = dt.getSeconds();

    var output = year + "-" +month + "-" + date + " " + hours +":"+minutes+":"+seconds;
    return output;
}
module.exports = { datetime };
